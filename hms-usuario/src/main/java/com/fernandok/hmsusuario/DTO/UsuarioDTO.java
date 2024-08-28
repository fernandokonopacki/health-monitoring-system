package com.fernandok.hmsusuario.DTO;

import lombok.Data;

@Data
public class UsuarioDTO {

    private Long idUsuario;
    private String nome;
    private String sobrenome;
    private String login;
    private String password;
    private String email;
    private String telefone;
}
