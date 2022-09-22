package application;

@EnableWebSecurity
public class WebSecurityConfig extends
WebSecurityConfigurerAdapter {

@Override
protected void configure(HttpSecurity http) throws Exception {
	http
	.headers()
		.frameOptions()
			.sameOrigin()
			.and()
		.hsts().disable();
}
}
