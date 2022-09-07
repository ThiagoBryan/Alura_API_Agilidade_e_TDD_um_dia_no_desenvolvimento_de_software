package br.com.caelum.clines.api.users;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.caelum.clines.shared.domain.User;

class UserViewMapperTest {

	private final String NAME = "FULANO";
	private final String EMAIL = "fulano@teste.com";
	private final String PASSWORD = "12345";
	
	private UserViewMapper mapper;
		
	@Test
	void shouldConvertUserToUserView() {
		var user = new User(NAME,EMAIL,PASSWORD); //criar um objeto
		mapper = new UserViewMapper();//instanciar o mapper para testar
		
		var userView = mapper.map(user);// devolve o metodo em userView
		assertEquals(NAME, userView.getName());// faz os asserts para teste
		assertEquals(EMAIL, userView.getEmail());
		
		
	}

}
