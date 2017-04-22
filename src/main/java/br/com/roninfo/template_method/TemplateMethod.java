package br.com.roninfo.template_method;

/**
 * Created by roninfo on 22/04/17.
 */
public class TemplateMethod {
    public static void main(String[] args) {
        ClasseAbstrata c = new ClasseConcreta();
        c.metodoTemplate();
    }
}
