package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer tania = new Computer("Apple", "Macbook Air");/// Constructor initialized
		Computer tania1 = new Computer("Apple", 'A', false);
		Computer tania2 = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800);
		Computer tania3 = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800, 'A');
		Computer tania4 = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800, 'A', false);
		Computer tania5 = new Computer("HP", "Pavilion 360", "Windows 11", 850, 'A', false);

	}

}
