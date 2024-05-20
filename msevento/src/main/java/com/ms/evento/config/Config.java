package com.ms.evento.config;

import com.ms.evento.adapters.outbound.ExibirEventosAdapter;
import com.ms.evento.adapters.outbound.SalvarEventoAdapter;
import com.ms.evento.aplication.core.service.BuscarEventoService;
import com.ms.evento.aplication.core.service.ExibirEventosService;
import com.ms.evento.aplication.core.service.SalvarEventoService;
import com.ms.evento.aplication.ports.out.BuscarEventoIdport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public SalvarEventoService salvarEventoService(SalvarEventoAdapter salvarEventoAdapter) {
		return new SalvarEventoService(salvarEventoAdapter);
	}

	@Bean
	public ExibirEventosService exibirEventosService(ExibirEventosAdapter exibirEventosAdapter) {
		return new ExibirEventosService(exibirEventosAdapter);
	}

	@Bean
	public BuscarEventoService buscarEventoService(BuscarEventoIdport buscarEventoIdport) {
		return new BuscarEventoService(buscarEventoIdport);
	}

}