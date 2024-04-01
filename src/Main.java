import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//● Java'da 100 adet random sayıya sahip bir liste oluşturun.

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {

            int number = random.nextInt(0,100000);
            Integer number1=number;
            if (randomNumbers.contains(number1)){
                i = i-1;
                continue;
            }
            randomNumbers.add(number1);
        }
        System.out.println(randomNumbers.size());

//● Daha sonra bu listenin bir kopyasını oluşturun.

        List<Integer>copiedList=new ArrayList<>();
        copiedList.addAll(randomNumbers);
        System.out.println(copiedList);

//● 0 ile 100 arasında rastgele bir sayı üretin.

        int randomIndex=random.nextInt(0,100);
        System.out.println(randomIndex);
        System.out.println(copiedList.get(randomIndex));
//● Kopya listedeki bu random sayının olduğu indisteski değeri silin.


        copiedList.remove(randomIndex);

        System.out.println(copiedList.size());

//● Şimdi elinizde iki adet liste var ve kopya listede orjinal listeye göre bir eleman eksik.
//● Hangi elemanın eksik olduğunu bulan bir metot oluşturun.

        System.out.println(FindMissingNumber.findMissingNumber(randomNumbers, copiedList));
    }
}