package br.com.caelum.clines.api.users;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.caelum.clines.shared.domain.User;

class UserFormMapperTest {

	private final String NAME = "Thiago";
	private final String EMAIL = "thiago@teste.com";
	private final String PASSWORD = "55555";

	private UserFormMapper mapper;

	@Test
	void shouldConvertUserFormToUser() {
		var userForm = new UserForm(NAME, EMAIL, PASSWORD);
		mapper = new UserFormMapper();

		var user = mapper.map(userForm);
		assertEquals(NAME, user.getName());
		assertEquals(EMAIL, user.getEmail());
		assertEquals(PASSWORD, user.getPassword());
	}

}
