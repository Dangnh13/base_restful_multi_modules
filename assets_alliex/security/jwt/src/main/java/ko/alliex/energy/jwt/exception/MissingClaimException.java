package ko.alliex.energy.jwt.exception;

public class MissingClaimException extends TokenException {
    public MissingClaimException(String message) {
        super(message);
    }
}
