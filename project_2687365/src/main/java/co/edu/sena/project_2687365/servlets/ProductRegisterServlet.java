package co.edu.sena.project_2687365.servlets;

import co.edu.sena.project_2687365.model.Product;

import co.edu.sena.project_2687365.model.repository.ProductRepositoryImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registerProduct")
public class ProductRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //collect all form data
        String product_name = request.getParameter("product_name");
        Float product_value = Float.parseFloat(request.getParameter("product_value"));
        Integer category_id = Integer.valueOf(request.getParameter("category_id"));

        // fill it up in a User bean
        Product product = new Product(product_name, product_value, category_id);

        // call Repository layer and save the user object to DB
        co.edu.sena.project_2687365.model.repository.Repository<Product> repository = new ProductRepositoryImpl();
        int rows = 0;
        try {
            rows = repository.saveObj(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //prepare an information message for user about success or failure of the operation
        String infoMessage = null;
        if (rows == 0){
            //infoMessage = "Lo sentimos, ocurrió un error!"
            System.out.println("Lo sentimos, ocurrió un error!");
        } else {
            //infoMessage = "Registro exitoso!"
            System.out.println("Registro exitoso!");
        }

        //todo write the message back to the page in client browser
    }
}
