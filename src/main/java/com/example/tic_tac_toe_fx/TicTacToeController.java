package com.example.tic_tac_toe_fx;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToeController {

    Image kolko = new Image("file:src/main/resources/graphics/0.jpg");

    Image krzyzyk = new Image("file:src/main/resources/graphics/x.jpg");

    @FXML
    ImageView siedem;

    @FXML
    ImageView osiem;

    @FXML
    ImageView dziewiec;

    @FXML
    ImageView cztery;

    @FXML
    ImageView piec;

    @FXML
    ImageView szesc;

    @FXML
    ImageView jeden;

    @FXML
    ImageView dwa;

    @FXML
    ImageView trzy;


    @FXML
    private Button przycisk1;
    @FXML
    private Button przycisk2;
    @FXML
    private Button przycisk3;
    @FXML
    private Button przycisk4;
    @FXML
    private Button przycisk5;
    @FXML
    private Button przycisk6;
    @FXML
    private Button przycisk7;
    @FXML
    private Button przycisk8;
    @FXML
    private Button przycisk9;
    @FXML
    private Label tekst;

    @FXML
    private Line linia1;

    @FXML
    private Line linia2;

    @FXML
    private Line linia3;

    @FXML
    private Line linia4;

    @FXML
    private Line linia5;

    @FXML
    private Line linia6;

    @FXML
    private Line linia7;

    @FXML
    private Line linia8;

    private int ktoryGracz = 0;

    private int ilerund = 0;

    private boolean klikniety7;

    private boolean klikniety8;

    private boolean klikniety9;

    private boolean klikniety4;

    private boolean klikniety5;

    private boolean klikniety6;

    private boolean klikniety1;

    private boolean klikniety2;

    private boolean klikniety3;

    private boolean remis;

    ArrayList<Button> przyciski;

    /**
     * Ustawia symbol danego przycisku, który został kliknięty.
     *
     * @param przycisk przycisk, który został kliknięty
     */
    public void ustalSymbol(Button przycisk){
        if(ktoryGracz == 0){
            przycisk.setText("X");
            tekst.setText("Kolej kółka!");
            ktoryGracz = 1;
        }
        else {
            przycisk.setText("O");
            tekst.setText("Kolej krzyżyka!");
            ktoryGracz = 0;
        }
    }
    /**
     * Ustawianie zdarzenia onMouseClicked dla numeru z numerem i
     *
     * @param i number of the button
     */
    public void ustawPrzycisk(int i){
        switch (i) {
            case 7 -> przycisk7.setOnMouseClicked(mouseEvent -> {

                ustalSymbol(przycisk7);

                if(ktoryGracz == 0){
                    gracz0(siedem,przycisk7);
                }
                if (ktoryGracz == 1){
                    gracz1(siedem,przycisk7);
                }

                przycisk7.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety7 = true;
            });
            case 8 -> przycisk8.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk8);

                if(ktoryGracz == 0){
                    gracz0(osiem,przycisk8);
                }
                if (ktoryGracz == 1){
                    gracz1(osiem,przycisk8);
                }
                przycisk8.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety8 = true;
            });
            case 9 -> przycisk9.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk9);

                if(ktoryGracz == 0){
                    gracz0(dziewiec,przycisk9);
                }
                if (ktoryGracz == 1){
                    gracz1(dziewiec,przycisk9);
                }

                przycisk9.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety9 = true;
            });
            case 4 -> przycisk4.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk4);

                if(ktoryGracz == 0){
                    gracz0(cztery,przycisk4);
                }
                if (ktoryGracz == 1){
                    gracz1(cztery,przycisk4);
                }

                przycisk4.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety4 = true;
            });
            case 5 -> przycisk5.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk5);

                if(ktoryGracz == 0){
                    gracz0(piec,przycisk5);
                }
                if (ktoryGracz == 1){
                    gracz1(piec,przycisk5);
                }

                przycisk5.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety5 = true;
            });
            case 6 -> przycisk6.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk6);

                if(ktoryGracz == 0){
                    gracz0(szesc,przycisk6);
                }
                if (ktoryGracz == 1){
                    gracz1(szesc,przycisk6);
                }

                przycisk6.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety6 = true;
            });
            case 1 -> przycisk1.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk1);

                if(ktoryGracz == 0){
                    gracz0(jeden,przycisk1);
                }
                if (ktoryGracz == 1){
                    gracz1(jeden,przycisk1);
                }

                przycisk1.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety1 = true;
            });
            case 2 -> przycisk2.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk2);

                if(ktoryGracz == 0){
                    gracz0(dwa,przycisk2);
                }
                if (ktoryGracz == 1){
                    gracz1(dwa,przycisk2);
                }

                przycisk2.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety2 = true;
            });
            case 3 -> przycisk3.setOnMouseClicked(mouseEvent -> {
                ustalSymbol(przycisk3);

                if(ktoryGracz == 0){
                    gracz0(trzy,przycisk3);
                }
                if (ktoryGracz == 1){
                    gracz1(trzy,przycisk3);
                }

                przycisk3.setDisable(true);
                ilerund++;
                //System.out.println(ilerund);
                czyKoniec();
                klikniety3 = true;
            });
        }
    }

    /**
     * Ustawienie przycisków i linii
     */
    public void initialize(){
        niePokazujLinii();
        przyciski = new ArrayList<>(Arrays.asList(przycisk1,przycisk2,przycisk3,przycisk4,przycisk5,przycisk6,przycisk7,przycisk8,przycisk9));

        for (int i=1; i<= przyciski.size(); i++)
            ustawPrzycisk(i);

        przyciski.forEach(przycisk -> {
            przycisk.setFocusTraversable(false);
        });
    }

    /**
     * Funkcja sprawdzająca, czy jest zwycięzca.
     */
    public void czyKoniec(){
        for(int i=1; i < 9;i++){
            String linia = switch (i){
                case 1 -> przycisk7.getText()+przycisk8.getText()+przycisk9.getText();
                case 2 -> przycisk4.getText()+przycisk5.getText()+przycisk6.getText();
                case 3 -> przycisk1.getText()+przycisk2.getText()+przycisk3.getText();
                case 4 -> przycisk7.getText()+przycisk4.getText()+przycisk1.getText();
                case 5 -> przycisk8.getText()+przycisk5.getText()+przycisk2.getText();
                case 6 -> przycisk9.getText()+przycisk6.getText()+przycisk3.getText();
                case 7 -> przycisk7.getText()+przycisk5.getText()+przycisk3.getText();
                case 8 -> przycisk9.getText()+przycisk5.getText()+przycisk1.getText();
                default -> null;
            };
            System.out.println(linia);
            if (ilerund == 9 && i==7 && !linia.equals("XXX")){
                tekst.setText("\tREMIS!");
            }
            else{
                //Jak wygra X
                if(linia.equals("XXX")){
                    przyciski.forEach(przycisk -> {
                        przycisk.setDisable(true);
                    });

                    wszystkieklikniete();

                    rysujLinie(i);
                    tekst.setText("Wygrał krzyżyk!");
                }
                else
                    //Jak wygra O
                    if(linia.equals("OOO")){
                        przyciski.forEach(przycisk -> {
                            przycisk.setDisable(true);
                        });

                        wszystkieklikniete();

                        rysujLinie(i);
                        tekst.setText("Wygrało kółko!");
                    }
            }
        }
    }

    /**
     * Funkcja ustalająca widoczność wszystkich linii na false.
     */
    public void niePokazujLinii(){
        linia1.setVisible(false);
        linia2.setVisible(false);
        linia3.setVisible(false);
        linia4.setVisible(false);
        linia5.setVisible(false);
        linia6.setVisible(false);
        linia7.setVisible(false);
        linia8.setVisible(false);
    }

    /**
     * W zależności od wartości sprawia, że podana linia jest widoczna.
     * @param i numer linii, który ma zostać narysowany
     */
    public void rysujLinie(int i){
        switch (i){
            case 1 -> linia1.setVisible(true);
            case 2 -> linia2.setVisible(true);
            case 3 -> linia3.setVisible(true);
            case 4 -> linia4.setVisible(true);
            case 5 -> linia5.setVisible(true);
            case 6 -> linia6.setVisible(true);
            case 7 -> linia7.setVisible(true);
            case 8 -> linia8.setVisible(true);
        }
    }
    /**
     * Switch sprawdzający który przycisk został kliknięty i wywołujący odpowiednie funkcje.
     *
     * @param i numer przycisku
     */
    public void klawisze(int i){
        switch (i) {
            case 7 -> {
                if(!klikniety7){
                    ustalSymbol(przycisk7);

                    if(ktoryGracz == 0){
                        gracz0(siedem,przycisk7);
                    }
                    if (ktoryGracz == 1){
                        gracz1(siedem,przycisk7);
                    }

                    przycisk7.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety7 = true;
            }
            case 8 -> {
                if(!klikniety8){
                    ustalSymbol(przycisk8);

                    if(ktoryGracz == 0){
                        gracz0(osiem,przycisk8);
                    }
                    if (ktoryGracz == 1){
                        gracz1(osiem,przycisk8);
                    }

                    przycisk8.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety8 = true;
            }
            case 9 -> {
                if(!klikniety9){
                    ustalSymbol(przycisk9);

                    if(ktoryGracz == 0){
                        gracz0(dziewiec,przycisk9);
                    }
                    if (ktoryGracz == 1){
                        gracz1(dziewiec,przycisk9);
                    }

                    przycisk9.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety9 = true;
            }
            case 4 -> {
                if(!klikniety4){
                    ustalSymbol(przycisk4);

                    if(ktoryGracz == 0){
                        gracz0(cztery,przycisk4);
                    }
                    if (ktoryGracz == 1){
                        gracz1(cztery,przycisk4);
                    }

                    przycisk4.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety4 = true;
            }
            case 5 -> {
                if(!klikniety5){
                    ustalSymbol(przycisk5);

                    if(ktoryGracz == 0){
                        gracz0(piec,przycisk5);
                    }
                    if (ktoryGracz == 1){
                        gracz1(piec,przycisk5);
                    }

                    przycisk5.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety5 = true;
            }
            case 6 -> {
                if(!klikniety6){
                    ustalSymbol(przycisk6);

                    if(ktoryGracz == 0){
                        gracz0(szesc,przycisk6);
                    }
                    if (ktoryGracz == 1){
                        gracz1(szesc,przycisk6);
                    }

                    przycisk6.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety6 = true;
            }
            case 1 -> {
                if(!klikniety1){
                    ustalSymbol(przycisk1);

                    if(ktoryGracz == 0){
                        gracz0(jeden,przycisk1);
                    }
                    if (ktoryGracz == 1){
                        gracz1(jeden,przycisk1);
                    }

                    przycisk1.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety1 = true;
            }
            case 2 -> {
                if(!klikniety2){
                    ustalSymbol(przycisk2);

                    if(ktoryGracz == 0){
                        gracz0(dwa,przycisk2);
                    }
                    if (ktoryGracz == 1){
                        gracz1(dwa,przycisk2);
                    }

                    przycisk2.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety2 = true;
            }
            case 3 -> {
                if(!klikniety3){
                    ustalSymbol(przycisk3);

                    if(ktoryGracz == 0){
                        gracz0(trzy,przycisk3);
                    }
                    if (ktoryGracz == 1){
                        gracz1(trzy,przycisk3);
                    }

                    przycisk3.setDisable(true);
                    ilerund++;
                    czyKoniec();
                }
                klikniety3 = true;
            }
        }

    }
    /**
     * Ustawienie obrazu na przycisku do symbolu gracza.
     *
     * @param view ImageView
     * @param button przycisk, który zostanie zmieniony
     */
    public void gracz0(ImageView view, Button button){
        view.setImage(kolko);
        view.setFitWidth(167);
        view.setFitHeight(167);
        view.setPreserveRatio(true);
        button.setGraphic(view);
        button.setPadding(Insets.EMPTY);
    }
    public void gracz1(ImageView view, Button button){
        view.setImage(krzyzyk);
        view.setFitWidth(167);
        view.setFitHeight(167);
        view.setPreserveRatio(true);
        button.setGraphic(view);
        button.setPadding(Insets.EMPTY);
    }
    /**
     * Zmienia stan zmiennych kliknięty, na true
     */
    public void wszystkieklikniete(){
        klikniety1 = true;
        klikniety2 = true;
        klikniety3 = true;
        klikniety4 = true;
        klikniety5 = true;
        klikniety6 = true;
        klikniety7 = true;
        klikniety8 = true;
        klikniety9 = true;
    }
}
