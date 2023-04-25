// Estudo - Encapsulamento
// Utilizando convenção JavaBeans - getter e setter

package entities;

public class Product1 {
    // atributos da classe
    private String name;
    private double price;
    private int quantity;

    // construtor sem paâmetros
    public Product1() {
    }

    // construtor com 3 parâmetros
    public Product1(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // construtor com 2 parâmetros
    public Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // setar o nome do atributo 'name'
    public void setName(String name) {
        this.name = name;
    }

    // retornar o atributo 'name'
    public String getName() {
        return name;
    }
    
    // setar o valor do atributo 'price'
    public void setPrice(double price) {
        this.price = price;
    }

    // retornar o atributo 'price'
    public double getPrice() {
        return price;
    }

    // retornar o atributo 'quantity'
    public int getQuantity() {
        return quantity;
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
