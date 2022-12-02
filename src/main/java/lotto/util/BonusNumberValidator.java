package lotto.util;

import lotto.model.numbers.Lotto;

public class BonusNumberValidator extends Validator {

    @Override
    public void validate(String input) throws IllegalArgumentException {
        String bonusNumber = removeSpace(input);
        validateNumber(bonusNumber);
        validateInputRange(bonusNumber);
    }



}
