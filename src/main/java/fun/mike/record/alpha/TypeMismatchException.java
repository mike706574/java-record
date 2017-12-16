package fun.mike.record.alpha;

public class TypeMismatchException extends RuntimeException {
    private String key;
    private Object value;
    private String typeName;
    private String className;

    public TypeMismatchException(String key, Object value, String typeName, String className) {
        this.key = key;
        this.value = value;
        this.typeName = typeName;
        this.className = className;
    }

    public String getMessage() {
        return String.format("Value \"%s\" of class \"%s\" for key \"%s\" must be %s %s.",
                value, className, key, aOrAn(typeName), typeName);
    }

    private String aOrAn(String followingWord) {
        boolean startsWithVowel = "aeiou".indexOf(Character.toLowerCase(followingWord.charAt(0))) != -1;
        return startsWithVowel ? "an" : "a";
    }
}
