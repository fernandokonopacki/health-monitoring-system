package com.fernandok.hmsusuario.services.serviceImpl;

import com.fernandok.hmsusuario.DTO.UsuarioDTO;
import com.fernandok.hmsusuario.model.Usuario;
import com.fernandok.hmsusuario.repositories.UsuarioRepository;
import com.fernandok.hmsusuario.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioServices {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Usuario fromDTO(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setSobrenome(usuarioDTO.getSobrenome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setTelefone(usuarioDTO.getTelefone());
        usuario.setLogin(usuarioDTO.getLogin());
        usuario.setPassword(bCryptPasswordEncoder.encode(usuarioDTO.getPassword()));

        return usuario;
    }

}
