// Estudo - Construtores e sobrecarga

package entities;

public class Product {
    // atributos da classe
    public String name;
    public double price;
    public int quantity;

    // construtor sem parâmetros
    public Product() {
    }

    // construtor com 3 parâmetros
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // construtor com 2 parâmetros
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // método para ver o total em estoque
    public double totalvalueInStock() {
        return price * quantity;
    }

    // adicionar produto
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // remover produto
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // retornar uma representação do objeto em formato de string
    public String toString() {
        return name
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalvalueInStock());
    }
}
