import java.util.Objects;

public class Address {
   private String country, city;


   @Override
   public boolean equals(Object o) {
      //проверяем, не передали ли ссылку на самого себя
      if (this == o) return true;
      // проверка на null
      // проверка на равенство К-сов, чтобы сработала строка Address address = (Address) o;
      if (o == null || getClass() != o.getClass()) return false;
      // перекастовка, ибо в пар-ры приходит Object
      Address address = (Address) o;
      return Objects.equals(country, address.country) && Objects.equals(city, address.city);
      //или
      //return country.equals(address.country) && city.equals(address.city);
   }

   @Override
   public int hashCode() {
      return Objects.hash(country, city);
   }

   //GnS ===================
   public String getCountry() {
      return country;
   }
   public void setCountry(String country) {
      this.country = country;
   }
   public String getCity() {
      return city;
   }
   public void setCity(String city) {
      this.city = city;
   }
}