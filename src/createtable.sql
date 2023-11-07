
CREATE TABLE IF NOT EXISTS cubesensors_data (
    SensorId        NVARCHAR (20) NOT NULL,
   MeasurementTime DATETIME NOT NULL,
   Temperature      INT  DEFAULT NULL,
    Pressure        INT  DEFAULT NULL,
    Humidity        INT  DEFAULT NULL,
    Voc             INT DEFAULT NULL,
    Light           INT  DEFAULT NULL,
    Noise           INT  DEFAULT NULL,
    Battery         INT  DEFAULT NULL,
    Cable           INT  DEFAULT NULL,
    VocResistance   INT  DEFAULT NULL,
    Rssi            INT   DEFAULT NULL
);
