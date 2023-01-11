public class Student {
  private String name;
  private String school;
  private String subjectChosenToImprove;
  private boolean paymentFee;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSchool() {
    return this.school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getChooseSubject() {
    return this.subjectChosenToImprove;
  }

  public void setChooseSubject(String subjectChosenToImprove) {
    this.subjectChosenToImprove = subjectChosenToImprove;
  }

  public boolean getPaymentFee() {
    return this.paymentFee;
  }

  public void setPaymentFee(boolean paymentFee) {
    this.paymentFee = paymentFee;
  }

  public String setPlan(String plan) {
    return plan;
  }

  public void changePlan(boolean paymentFee) {
    if (paymentFee)
      this.setPlan("Plano pago");
    else
      this.setPlan("Plano free");
  }

}
