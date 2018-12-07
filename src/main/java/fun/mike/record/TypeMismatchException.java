package fun.mike.record;

/**
 * Thrown when the type of a value from a record does not match the expected
 * type in the context of a specific operation.
 */
public class TypeMismatchException extends RuntimeException {
    private final String key;
    private final Object value;
    private final String typeName;
    private final String className;

    /**
     * Constructs a TypeMismatchException with the given key, value, expected
     * type, and the class name of the actual value.
     * @param key the key
     * @param value the value from the record
     * @param typeName the expected type of value
     * @param className the actual class name of the value
     */
    public TypeMismatchException(String key, Object value, String typeName, String className) {
        this.key = key;
        this.value = value;
        this.typeName = typeName;
        this.className = className;
    }

    /**
     * Returns a message stating that the value does not match the expected
     * type.
     * @return a message stating that the value does not match the expected
     * type
     */
    public String getMessage() {
        return String.format("Value \"%s\" of class \"%s\" for key \"%s\" must be %s %s.",
                             value, className, key, aOrAn(typeName), typeName);
    }

    private String aOrAn(String followingWord) {
        boolean startsWithVowel = "aeiou".indexOf(Character.toLowerCase(followingWord.charAt(0))) != -1;
        return startsWithVowel ? "an" : "a";
    }
}
