package ru.netology.domain;

import java.util.List;

public class Complain {
    private List listOfReasons;
    private boolean selectedReason;

    public List getListOfReasons() {
        return listOfReasons;
    }

    public void setListOfReasons(List listOfReasons) {
        this.listOfReasons = listOfReasons;
    }

    public boolean isSelectedReason() {
        return selectedReason;
    }

    public void setSelectedReason(boolean selectedReason) {
        this.selectedReason = selectedReason;
    }
}
