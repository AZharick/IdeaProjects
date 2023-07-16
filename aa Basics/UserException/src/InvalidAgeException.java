public class InvalidAgeException extends Exception{
    @Override
    public String getMessage() {
        return "Такого возраста не может быть";
    }
}