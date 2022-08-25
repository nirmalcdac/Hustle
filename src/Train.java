import java.util.List;

class Train {
    private String trainId; // uuid
    private String trainNo;  //12095, 12096
    private String trainName;  //Del BLR EXP
    private String startingStation; //DEl
    private String endingStation; //BLR
    private List<TrainStationMapping> trainStationMappingsList;
    private List<TrainDayMapping> trainDayMappingsList;
    private boolean isActive; //1
}

class Station {
    private String stationId; //uuid
    private String stationName; //NGP
    private boolean isActive; //1
}

class Days {
    private String DayId; //1
    private String DayName; //
}

class TrainStationMapping {
    //Mapped to Train class
    private String mappingId;
    private String trainId;
    //Mapped to Station Class
    private String stationId;
    private Integer day; //+1, +2 , 0, +3
    private boolean isActive;
}

class TrainDayMapping {
    private String trainDayMappingId;
    private String trainId;
    private String dayId;
}