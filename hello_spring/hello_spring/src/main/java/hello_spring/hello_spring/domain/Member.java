package hello_spring.hello_spring.domain;

public class Member {
        private  Long id; //id식별자
        private String name; //string type의 이름

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
