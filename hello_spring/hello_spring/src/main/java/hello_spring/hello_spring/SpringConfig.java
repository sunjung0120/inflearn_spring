package hello_spring.hello_spring;

import hello_spring.hello_spring.repository.JdbcTempleteMemberRepository;
import hello_spring.hello_spring.repository.MemberRepository;
import hello_spring.hello_spring.repository.MemoryMemberRepository;
import hello_spring.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import hello_spring.hello_spring.repository.JdbcMemberRepository;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource; }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTempleteMemberRepository(dataSource);
    }

}
