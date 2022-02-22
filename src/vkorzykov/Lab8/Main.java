package vkorzykov.Lab8;

import vkorzykov.Lab8.Exception.WrongLoginException.WrongLoginException;
import vkorzykov.Lab8.Exception.WrongPasswordException.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Authentication vadim = new Authentication();
        vadim.authorise();
        System.out.println(vadim);

    }
}
