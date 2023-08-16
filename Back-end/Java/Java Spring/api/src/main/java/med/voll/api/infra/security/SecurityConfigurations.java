package med.voll.api.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {


    /*O @Bean serve para exibir o retorno desse método, que estamos devolvendo um objeto SecurityFilterChain.Para devolvermos
    um objeto para o Spring, usamos a anotação
    Desabilitando o tratamento contra-ataque CSRF e, na sequência, desabilitando o processo de autenticação
    padrão do Spring. Isso porque estamos usando uma API Rest, e queremos que seja stateless.*/
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }
}
