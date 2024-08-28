package com.fernandok.hmsusuario.services;

import com.fernandok.hmsusuario.DTO.UsuarioDTO;
import com.fernandok.hmsusuario.model.Usuario;

public interface UsuarioServices {

    Usuario fromDTO(UsuarioDTO usuarioDTO);

}
