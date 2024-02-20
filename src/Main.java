/* Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo. */

class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8, 4);
        Rectangle rectangle2 = new Rectangle(6, 16);
        Rectangle rectangle3 = new Rectangle(22, 12);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle3.calculateArea());
    }
}