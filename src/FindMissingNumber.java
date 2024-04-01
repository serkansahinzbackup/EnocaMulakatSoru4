import java.util.List;

public class FindMissingNumber {

    public static Integer findMissingNumber(List<Integer> originalList, List<Integer> alteredList){
        Integer missingNumber=null;
        for (int i = 0; i < originalList.size(); i++) {

            if (!alteredList.contains(originalList.get(i))){
                missingNumber=originalList.get(i);
            }
        }
        return missingNumber;
    }
}
