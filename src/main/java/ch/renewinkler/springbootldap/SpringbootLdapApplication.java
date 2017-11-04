package ch.renewinkler.springbootldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLdapApplication {

    /** README
     * Login: user=ben pw=benspassword
     * set dev as active profile
     **/
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLdapApplication.class, args);
	}
}
