package guru.springframework.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Créé par dmitri le 2021-09-30.
 */
@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

//    @ResponseStatus(HttpStatus.BAD_REQUEST) // 400
//    @ExceptionHandler(NumberFormatException.class)
//    public ModelAndView handleNumberFormat(Exception exception){
//
//        log.error("Handling Number Format Exception");
//        log.error(exception.getMessage());
//
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.setViewName("400error");
//        modelAndView.addObject("exception", exception);
//
//        return modelAndView;
//    }
}
