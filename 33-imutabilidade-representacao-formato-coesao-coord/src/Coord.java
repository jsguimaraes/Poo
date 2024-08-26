public class Coord {
  final double latitude;
  final double longitude;

  public Coord() {
    this.latitude = 0.0;
    this.longitude = 0.0;
  }

  public Coord(double latitude, double longitude) {
    if(latitude < -90 || latitude > 90){
      throw  new IllegalArgumentException("Latitude deve estar entre -90.0 e 90.0");
    }
    if(longitude < -180 || longitude > 180){
      throw  new IllegalArgumentException("Longitude deve estar entre -180.0 e 180.0");
    }
    this.latitude = latitude;
    this.longitude = longitude;
  }

  Coord norte(double d) {
    double novaLatitude = this.latitude + d;
    if(novaLatitude > 90.0){
      novaLatitude = 90.0;
    }else if(novaLatitude < -90){
      novaLatitude = -90;
    }
    return new Coord(novaLatitude, this.longitude);
  }

  Coord sul(double d) {
    double novaLatitude = this.latitude - d;
    if(novaLatitude > 90){
      novaLatitude = 90;
    } else if(novaLatitude < -90){
      novaLatitude = -90;
    }
    return new Coord(novaLatitude, this.longitude);
  }

  Coord leste(double d) {
    double novaLongitude = this.longitude + d;
    if(novaLongitude > 180){
      novaLongitude = 180;
    } else if(novaLongitude < -180){
      novaLongitude = -180;
    }
    return new Coord(this.latitude, novaLongitude);
  }

  Coord oeste(double d) {
    double novaLongitude = this.longitude - d;
    if(novaLongitude > 180){
      novaLongitude = 180;
    } else if(novaLongitude < -180){
      novaLongitude = -180;
    }
    return new Coord(this.latitude, novaLongitude);
  }

  boolean noEquador() {
    return this.latitude ==0.0;
  }

  boolean emGreenwich() {
    return this.longitude == 0;
  }

  boolean noNorte() {
    return this.latitude >0;
  }

  boolean noSul() {
    return this.latitude < 0;
  }

  boolean noOriente() {
    return this.longitude > 0;
  }

  boolean noOcidente() {
    return this.longitude < 0;
  }


}
