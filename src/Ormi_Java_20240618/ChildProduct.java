package Ormi_Java_20240618;

public class ChildProduct<T, M, C> extends Product<T, M> {
  public C getCompany;

  public C getGetCompany() {
    return getCompany;
  }

  public void setCompany(C getCompany) {
    this.getCompany = getCompany;
  }
}
