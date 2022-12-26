import time
from plyer import notification

if __name__ == "__main__":
    notification.notify(
        title = "Please Drink Water",
        message = "enough",
        #app_icon = "E:\HelloApp\glass.ico",
        timeout = 2
        )
time.sleep(6)