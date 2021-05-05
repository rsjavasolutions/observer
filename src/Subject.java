public interface Subject {
    // powoduje dodanie nowego obserwatora (obserwator jest zainteresowany zmianami),
    void attach(Observer observer);

    //powoduje usunięcie istniejącego obserwatora (obserwator nie jest już zainteresowany zmianami),
    void detach(Observer observer);

    //powoduje powiadomienie wszystkich obserwatorów o wystąpieniu zmiany.
    void notifyObservers();
}
