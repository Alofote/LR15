package org.example;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class App
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите номер задания: ");
        int zadanie = sc.nextInt();
        switch (zadanie) {
            case 1:
                File file = new File("food.txt");
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    String text = "Любимая еда: плов\nВторое блюдо: борщ\nДесерт: мороженое\nНапиток: чай с лимоном\n";
                    fos.write(text.getBytes("UTF-8"));
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                    return;
                }
                System.out.println("Имя файла:           " + file.getName());
                System.out.println("Размер (байт):       " + file.length());
                System.out.println("Последнее изменение: " + file.lastModified());
                System.out.println("Родительский каталог:" + file.getParent());
                System.out.println("Путь:                " + file.getPath());
                System.out.println("Абсолютный путь:     " + file.getAbsolutePath());
                System.out.println("Существует:          " + file.exists());
                System.out.println("Можно читать:        " + file.canRead());
                System.out.println("Можно писать:        " + file.canWrite());
                System.out.println("Это каталог:         " + file.isDirectory());
                System.out.println("Это обычный файл:    " + file.isFile());

                try (FileInputStream fis = new FileInputStream(file)) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = fis.read(buffer)) != -1) {
                        System.out.print(new String(buffer, 0, bytesRead, "UTF-8"));
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                }
                break;
            case 2:
                file = new File("f.txt");
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    System.out.println("Введите 10 целых чисел:");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Число " + (i + 1) + ": ");
                        int n = sc.nextInt();
                        String s = n + "\n";
                        fos.write(s.getBytes());
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                    return;
                }

                int count = 0;
                System.out.println("\nЧисла из файла:");
                try (FileInputStream fis = new FileInputStream(file)) {
                    StringBuilder sb = new StringBuilder();
                    int b;
                    while ((b = fis.read()) != -1) {
                        if (b == '\n') {
                            int n = Integer.parseInt(sb.toString().trim());
                            System.out.print(n + " ");
                            if (n % 2 != 0) count++;
                            sb.setLength(0);
                        } else {
                            sb.append((char) b);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                    return;
                }
                System.out.println("\nКоличество нечётных чисел: " + count);
                break;
            case 3:
                File f = new File("f.txt");
                File g = new File("g.txt");
                File h = new File("h.txt");
                Random rnd = new Random();

                try (FileOutputStream fos = new FileOutputStream(f)) {
                    for (int i = 0; i < 20; i++) {
                        String s = rnd.nextInt(1000) + "\n";
                        fos.write(s.getBytes());
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи f: " + e.getMessage());
                    return;
                }

                try (FileInputStream fis = new FileInputStream(f);
                     FileOutputStream wg = new FileOutputStream(g);
                     FileOutputStream wh = new FileOutputStream(h)) {

                    StringBuilder sb = new StringBuilder();
                    int b;
                    while ((b = fis.read()) != -1) {
                        if (b == '\n') {
                            int n = Integer.parseInt(sb.toString().trim());
                            String s = n + "\n";
                            if (String.valueOf(n).contains("5")) {
                                wg.write(s.getBytes());
                            } else {
                                wh.write(s.getBytes());
                            }
                            sb.setLength(0);
                        } else {
                            sb.append((char) b);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка обработки: " + e.getMessage());
                    return;
                }

                System.out.println("Файл f создан.");
                System.out.println("Числа с цифрой 5 записаны в g.txt, остальные — в h.txt.");
                break;
            case 4:
                file = new File("volume.txt");
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    System.out.println("Введите 15 значений объёма жидкости:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Значение " + (i + 1) + ": ");
                        double v = sc.nextDouble();
                        if(v<0){
                          v = 0;
                        }

                        String s = v + "\n";
                        fos.write(s.getBytes());
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                    return;
                }

                double sum = 0;
                count = 0;
                try (FileInputStream fis = new FileInputStream(file)) {
                    StringBuilder sb = new StringBuilder();
                    int b;
                    while ((b = fis.read()) != -1) {
                        if (b == '\n') {
                            sum += Double.parseDouble(sb.toString().trim());
                            count++;
                            sb.setLength(0);
                        } else {
                            sb.append((char) b);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                    return;
                }

                if (count > 0) {
                    System.out.printf("Средний объём: %.2f%n", sum / count);
                } else {
                    System.out.println("Файл пуст.");
                }
                break;
            case 5:
                f = new File("f_range.txt");
                rnd = new Random();

                try (FileOutputStream fos = new FileOutputStream(f)) {
                    for (int i = 0; i < 10; i++) {
                        String s = (rnd.nextInt(201) - 100) + "\n";
                        fos.write(s.getBytes());
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                    return;
                }

                count = 0;
                System.out.println("Числа в файле:");
                try (FileInputStream fis = new FileInputStream(f)) {
                    StringBuilder sb = new StringBuilder();
                    int b;
                    while ((b = fis.read()) != -1) {
                        if (b == '\n') {
                            int n = Integer.parseInt(sb.toString().trim());
                            System.out.print(n + " ");
                            if (n >= -50 && n <= 50) count++;
                            sb.setLength(0);
                        } else {
                            sb.append((char) b);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                    return;
                }

                System.out.println("\nКоличество чисел в диапазоне от -50 до 50: " + count);
                break;
            case 0:
                System.out.println("Выход из программы.");
                sc.close();
                return;
            default:
                System.out.println("Такого пункта нет. Повторите выбор.");
        }
    }
}