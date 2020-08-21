package org.primefaces.showcase.validate;

import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "AtLeast2Validator")
public class AtLeast2Validator implements Validator<Collection<?>> {

    @Override
    public void validate(FacesContext context, UIComponent component, Collection<?> value) throws ValidatorException {
        if (value instanceof Collection<?> && ((Collection<?>) value).size() < 2) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "2 items or more required", "At least 2 items must be selected."));
        }
    }
}
