public class User extends ArithmeticException {
    private  String name;
    private  int price;
    private  int sum;

    public User(String name, int price, int sum) {
        this.name = name;
        this.price = price;
        this.sum = sum;
    }

    public void payment() throws ArithmeticException {      // Проверяет оплату
        if (price <= sum || price == sum){
            System.out.println("Оплата прошла");
        }else {
            throw new ArithmeticException();
        }
    }
    public void checkPayment() {                            // В случае , если сумма внесенных денег недостаточна, обрабатывает ошибку
        try {
            payment();
        }catch (ArithmeticException e){
            System.out.println("Недостаточно средств");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

//Задача: Напишите программу, которая моделирует работу кассового аппарата в магазине.
// Программа должна запрашивать у пользователя цену товара и сумму, которую пользователь внес для оплаты.
// Если сумма внесенных денег достаточна для оплаты товара, то программа должна выдать сдачу.
// Если сумма внесенных денег недостаточна, то программа должна выдать сообщение об ошибке и запросить внесение оставшейся суммы.
// Программа должна обрабатывать исключительные ситуации, такие как ввод некорректных данных (например, отрицательных чисел)
// и бросать соответствующие исключения с понятными сообщениями об ошибке.
