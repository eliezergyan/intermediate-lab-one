package generics;

public class Validator {
    public static <T> boolean validateData(T data, ValidatorCriteria<T> criteria){
        return criteria.isValid(data);
    }

    public interface ValidatorCriteria<T> {
        boolean isValid(T data);
    }




}
