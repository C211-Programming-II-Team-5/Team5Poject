module HolidayMaze {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.datatransfer;
    requires java.desktop;

    opens HolidayMaze to javafx.fxml;
    exports HolidayMaze;
    requires javafx.media;
}
