# Importe das bibliotecas

import pyautogui

# Apresentação

print('\n\nHello, welcome to cv APinfo bot. \n')

# Entrada de dados

tabs = int(input('Enter to tabs amount: '));

if tabs == 0:
	tabs = int(input('Enter to tabs amount: '));
elif tabs == 0:
	quit();
else:

	# PARA cada valor "i" em "tabs" FAÇA:
	for i in range(tabs):
		# Abrir composição

		pyautogui.click(75,172,duration=1);

		# Copiar endereço de email

		pyautogui.click(1450,12,duration=1);
		pyautogui.click(1738,408,duration=1) 
		pyautogui.drag(300,0,1,button='left');
		pyautogui.hotkey('ctrl','c');

		# Colar endereço no destinatario

		pyautogui.click(850,308,duration=1);
		pyautogui.hotkey('ctrl','v');

		# Copiar assunto do email

		pyautogui.click(1908,428,duration=1) 
		pyautogui.drag(300,0,1,button='left');
		pyautogui.hotkey('ctrl','c');

		# Colar assunto

		pyautogui.click(850,378,duration=1);
		pyautogui.hotkey('ctrl','v');

		# Anexar arquivo ao email

		pyautogui.click(958,695,duration=1);
		pyautogui.click(232,174,duration=1);
		pyautogui.click(634,448,duration=1);

		# Enviar

		pyautogui.click(840,698,duration=10);

		# Fechar aba

		pyautogui.click(1450,12,duration=1);
		pyautogui.hotkey('ctrl','f4');

		# Repetir
