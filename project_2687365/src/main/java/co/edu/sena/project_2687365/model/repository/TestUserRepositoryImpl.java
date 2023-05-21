package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.User;
import co.edu.sena.project_2687365.model.User;


import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        co.edu.sena.project_2687365.model.repository.Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert1 = new User();
        userInsert1.setUser_firstname("Juan");
        userInsert1.setUser_lastname("Abreu");
        userInsert1.setUser_email("jjk@gmail.com");
        userInsert1.setUser_password("siabreu21");
        repository.saveObj(userInsert1);

        User userInsert2 = new User();
        userInsert2.setUser_firstname("Juanjo");
        userInsert2.setUser_lastname("Abreo");
        userInsert2.setUser_email("jk@gmail.com");
        userInsert2.setUser_password("noabreu21");
        repository.saveObj(userInsert2);


        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_firstname("jose");
        userUpdate.setUser_lastname("ramo");
        userUpdate.setUser_email("jora@gmail.com");
        userUpdate.setUser_password("21noramo");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

