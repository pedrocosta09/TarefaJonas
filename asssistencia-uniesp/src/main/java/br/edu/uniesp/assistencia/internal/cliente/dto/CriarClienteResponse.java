package br.edu.uniesp.assistencia.internal.cliente.dto;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public record CriarClienteResponse(String nome, String email) {
}
