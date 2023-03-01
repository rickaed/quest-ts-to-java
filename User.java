import java.util.Date;
import java.util.List;

public class User {
       private Date birthdate;
       private float size;
       private List<Photo> photos;
       private Address address;

       public User(Date birthdate, float size, List<Photo> photos, Address address) {
              this.birthdate = birthdate;
              this.size = size;
              this.photos = photos;
              this.address = address;
       }

       public Date getBirthdate() {
              return this.birthdate;
       }

       public void setBirthdate(Date birthdate) {
              this.birthdate = birthdate;
       }

       public float getSize() {
              return this.size;
       }

       public void setSize(float size) {
              this.size = size;
       }

       public List<Photo> getPhotos() {
              return this.photos;
       }

       public void setPhotos(List<Photo> photos) {
              this.photos = photos;
       }

       public Address getAddress() {
              return this.address;
       }

       public void setAddress(Address address) {
              this.address = address;
       }
}