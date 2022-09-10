public class AssociationTest {
    public static void main(String[] args) {
        Track track1 = new Track("Track1", "first song", 3);
        Track track2 = new Track("Track2", "second song", 4);
        MusicAlbum musicAlbum = new MusicAlbum("my music album");
        musicAlbum.setTrack1(track1);
        musicAlbum.setTrack2(track2);


        Product product1 = new Product("01", "my product 1", "my product description");
        LineItem lineItem1 = new LineItem("001", product1, 10);
    }
}
