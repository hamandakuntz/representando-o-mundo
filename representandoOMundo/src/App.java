public class App {
    public static void main(String[] args) {
        Payment newPayment = new Payment();
        newPayment.state = "Rio de Janeiro";
        newPayment.city = "São Gonçalo";
        newPayment.setCpf("343.534.343-33");
        newPayment.setCreditCardNumber(11233444);
        newPayment.setEmail("fulano@fulano.com");

        Student newStudent = new Student();
        newStudent.setName("Fulano");
        newStudent.setSchool("UFRJ");
        newStudent.setChooseSubject("Cálculo 1");
        newStudent.changePlan(false);
    }
}
