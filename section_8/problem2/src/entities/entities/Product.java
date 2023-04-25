// package section_8.problem2.entities;

public class Product {
    // atributos da classe
    public String name;
    public double price;
    public int quantity;

    // método para ver o total em estoque
    public double totalvalueInStock() {
        return price * quantity;
    }

    // método para adicionar produto
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // método para remover produto
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // método para retornar uma representação em formato de string do objeto
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
