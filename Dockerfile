FROM katalonstudio/katalon
COPY gui_test/chromedriver /opt/katalonstudio/configuration/resources/drivers/chromedriver_linux64/chromedriver
RUN chmod 777 /opt/katalonstudio/configuration/resources/drivers/chromedriver_linux64/chromedriver