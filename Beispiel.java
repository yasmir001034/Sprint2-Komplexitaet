public class BluetoothTest {

    public static void bluetoothTest() {

        restartMPD();

        setBluetoothOutput();

        clearPlaylist();

        addSong();

        playSong();

        boolean tonHoerbar = speakerTest();

        if (tonHoerbar) {
            System.out.println("Bluetooth funktioniert");
        } else {
            System.out.println("Audio-Routing prüfen");
        }
    }
}
    }
}
