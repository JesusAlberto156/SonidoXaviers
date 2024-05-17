
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chuy4
 */
public class Parametros extends javax.swing.JFrame {

    private int cancion = 1;
    private Clip clip;
    public String Evento;
    private FloatControl volumeControl;
    Color Boton = new Color(144,242,232);
    
    /**
     * Creates new form Parametros
     */
    public Parametros() {
        initComponents();
        
        PanelMusica2.setVisible(false);
        PanelVolumen2.setVisible(false);
        Mas1.setBackground(Color.CYAN);
        Mas2.setBackground(Color.CYAN);
        Menos1.setBackground(Color.CYAN);
        Menos2.setBackground(Color.CYAN);
        AtrasMusica1.setBackground(Color.CYAN);
        AtrasMusica2.setBackground(Color.CYAN);
        AdelanteMusica1.setBackground(Color.CYAN);
        AdelanteMusica2.setBackground(Color.CYAN);
        DetenerMusica.setBackground(Color.CYAN);
        IniciarMusica.setBackground(Color.CYAN);
    }
    
    public void setEvento(String evento){
        this.Evento = evento;
        this.setTitle("Luz y sonido xaviers - Parámetros - "+Evento);
    }
    
    public void setAudio(){
        if(Evento.equals("Boda")){
            try {

                // Ruta del archivo de audio
                File audioFile = new File("src\\MUSICA\\BODA\\"+cancion+".wav");

                // Cargar el archivo de audio
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                // Obtener el clip de audio
                clip = AudioSystem.getClip();

                // Abrir el clip de audio y reproducirlo
                clip.open(audioStream);

                volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                clip.start();

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
        }else if(Evento.equals("XV Años")){
            try {

                // Ruta del archivo de audio
                File audioFile = new File("src\\MUSICA\\XV\\"+cancion+".wav");

                // Cargar el archivo de audio
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                // Obtener el clip de audio
                clip = AudioSystem.getClip();

                // Abrir el clip de audio y reproducirlo
                clip.open(audioStream);

                volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                clip.start();

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
        }else if(Evento.equals("Cumpleaños")){
            try {

                // Ruta del archivo de audio
                File audioFile = new File("src\\MUSICA\\CUMPLEAÑOS\\"+cancion+".wav");

                // Cargar el archivo de audio
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                // Obtener el clip de audio
                clip = AudioSystem.getClip();

                // Abrir el clip de audio y reproducirlo
                clip.open(audioStream);

                volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                clip.start();

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
        }else{
        
        }
    }
    
     public void changeVolumeMas(float change) {
        if (volumeControl != null) {
            float currentVolume = volumeControl.getValue();
            float newVolume = currentVolume + change;
            newVolume = Math.min(volumeControl.getMaximum(), Math.max(volumeControl.getMinimum(), newVolume)); // Limitar al rango permitido
            volumeControl.setValue(newVolume);
            System.out.println("Volumen ajustado a: " + newVolume + " dB");
        }
    }
     
    public void changeVolumeMenos(float change) {
        if (volumeControl != null) {
            float currentVolume = volumeControl.getValue();
            float newVolume = currentVolume - change;
            newVolume = Math.min(volumeControl.getMaximum(), Math.max(volumeControl.getMinimum(), newVolume)); // Limitar al rango permitido
            volumeControl.setValue(newVolume);
            System.out.println("Volumen ajustado a: " + newVolume + " dB");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelTitulo = new FondoPanel2();
        Titulo = new javax.swing.JPanel();
        PanelMusica1 = new javax.swing.JPanel();
        DetenerMusica = new javax.swing.JButton();
        AtrasMusica1 = new javax.swing.JButton();
        AdelanteMusica1 = new javax.swing.JButton();
        PanelMusica2 = new javax.swing.JPanel();
        IniciarMusica = new javax.swing.JButton();
        AtrasMusica2 = new javax.swing.JButton();
        AdelanteMusica2 = new javax.swing.JButton();
        PanelVolumen1 = new javax.swing.JPanel();
        Mas1 = new javax.swing.JButton();
        Menos1 = new javax.swing.JButton();
        PanelVolumen2 = new javax.swing.JPanel();
        Mas2 = new javax.swing.JButton();
        Menos2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelMenu = new FondoPanel1();
        jPanel1 = new javax.swing.JPanel();
        Simular = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        PanelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        PanelTitulo.setOpaque(false);

        Titulo.setBackground(new java.awt.Color(174, 229, 154));
        Titulo.setOpaque(false);

        PanelMusica1.setOpaque(false);

        DetenerMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Musica2.png"))); // NOI18N
        DetenerMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DetenerMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DetenerMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetenerMusicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DetenerMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DetenerMusicaMouseExited(evt);
            }
        });
        DetenerMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetenerMusicaActionPerformed(evt);
            }
        });

        AtrasMusica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Musica4.png"))); // NOI18N
        AtrasMusica1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AtrasMusica1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AtrasMusica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMusica1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMusica1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMusica1MouseExited(evt);
            }
        });
        AtrasMusica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasMusica1ActionPerformed(evt);
            }
        });

        AdelanteMusica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Musica3.png"))); // NOI18N
        AdelanteMusica1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdelanteMusica1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdelanteMusica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdelanteMusica1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdelanteMusica1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdelanteMusica1MouseExited(evt);
            }
        });
        AdelanteMusica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdelanteMusica1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMusica1Layout = new javax.swing.GroupLayout(PanelMusica1);
        PanelMusica1.setLayout(PanelMusica1Layout);
        PanelMusica1Layout.setHorizontalGroup(
            PanelMusica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMusica1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasMusica1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetenerMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdelanteMusica1)
                .addContainerGap())
        );
        PanelMusica1Layout.setVerticalGroup(
            PanelMusica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMusica1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMusica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdelanteMusica1)
                    .addComponent(AtrasMusica1)
                    .addComponent(DetenerMusica))
                .addContainerGap())
        );

        PanelMusica2.setOpaque(false);

        IniciarMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Musica1.png"))); // NOI18N
        IniciarMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IniciarMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IniciarMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarMusicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IniciarMusicaMouseExited(evt);
            }
        });
        IniciarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarMusicaActionPerformed(evt);
            }
        });

        AtrasMusica2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Musica4.png"))); // NOI18N
        AtrasMusica2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AtrasMusica2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AtrasMusica2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMusica2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMusica2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMusica2MouseExited(evt);
            }
        });
        AtrasMusica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasMusica2ActionPerformed(evt);
            }
        });

        AdelanteMusica2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Musica3.png"))); // NOI18N
        AdelanteMusica2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdelanteMusica2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdelanteMusica2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdelanteMusica2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdelanteMusica2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdelanteMusica2MouseExited(evt);
            }
        });
        AdelanteMusica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdelanteMusica2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMusica2Layout = new javax.swing.GroupLayout(PanelMusica2);
        PanelMusica2.setLayout(PanelMusica2Layout);
        PanelMusica2Layout.setHorizontalGroup(
            PanelMusica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMusica2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasMusica2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdelanteMusica2)
                .addContainerGap())
        );
        PanelMusica2Layout.setVerticalGroup(
            PanelMusica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMusica2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMusica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdelanteMusica2)
                    .addComponent(IniciarMusica)
                    .addComponent(AtrasMusica2))
                .addContainerGap())
        );

        PanelVolumen1.setOpaque(false);

        Mas1.setForeground(new java.awt.Color(255, 255, 255));
        Mas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Volumen1.png"))); // NOI18N
        Mas1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mas1.setMaximumSize(new java.awt.Dimension(20, 20));
        Mas1.setMinimumSize(new java.awt.Dimension(20, 20));
        Mas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Mas1MouseExited(evt);
            }
        });
        Mas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas1ActionPerformed(evt);
            }
        });

        Menos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Volumen2.png"))); // NOI18N
        Menos1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menos1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menos1MouseExited(evt);
            }
        });
        Menos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVolumen1Layout = new javax.swing.GroupLayout(PanelVolumen1);
        PanelVolumen1.setLayout(PanelVolumen1Layout);
        PanelVolumen1Layout.setHorizontalGroup(
            PanelVolumen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVolumen1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menos1)
                .addContainerGap())
        );
        PanelVolumen1Layout.setVerticalGroup(
            PanelVolumen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVolumen1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVolumen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menos1)
                    .addComponent(Mas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelVolumen2.setOpaque(false);

        Mas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Volumen1.png"))); // NOI18N
        Mas2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mas2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Mas2MouseExited(evt);
            }
        });
        Mas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas2ActionPerformed(evt);
            }
        });

        Menos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Volumen2.png"))); // NOI18N
        Menos2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menos2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menos2MouseExited(evt);
            }
        });
        Menos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVolumen2Layout = new javax.swing.GroupLayout(PanelVolumen2);
        PanelVolumen2.setLayout(PanelVolumen2Layout);
        PanelVolumen2Layout.setHorizontalGroup(
            PanelVolumen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVolumen2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menos2)
                .addContainerGap())
        );
        PanelVolumen2Layout.setVerticalGroup(
            PanelVolumen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVolumen2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVolumen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menos2)
                    .addComponent(Mas2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                        .addComponent(PanelVolumen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMusica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                        .addComponent(PanelVolumen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMusica2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelVolumen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelMusica1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelVolumen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMusica2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PARÁMETROS DEL EVENTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        jPanel1.setOpaque(false);

        Simular.setBackground(new java.awt.Color(144, 242, 232));
        Simular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Simular.setText("SIMULAR");
        Simular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Simular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SimularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SimularMouseExited(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(144, 242, 232));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cancelar.setText("CANCELAR");
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelarMouseExited(evt);
            }
        });
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Simular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Simular, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addGap(0, 296, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DetenerMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetenerMusicaMouseClicked
        PanelMusica1.setVisible(false);
        PanelMusica2.setVisible(true);
        PanelVolumen1.setVisible(false);
        PanelVolumen2.setVisible(true);
    }//GEN-LAST:event_DetenerMusicaMouseClicked

    private void DetenerMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetenerMusicaMouseEntered
        DetenerMusica.setBackground(Color.RED);
    }//GEN-LAST:event_DetenerMusicaMouseEntered

    private void DetenerMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetenerMusicaMouseExited
        DetenerMusica.setBackground(Color.CYAN);
    }//GEN-LAST:event_DetenerMusicaMouseExited

    private void DetenerMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetenerMusicaActionPerformed
        try {

            clip.stop();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DetenerMusicaActionPerformed

    private void AtrasMusica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMusica1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasMusica1MouseClicked

    private void AtrasMusica1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMusica1MouseEntered
        AtrasMusica1.setBackground(Color.RED);
    }//GEN-LAST:event_AtrasMusica1MouseEntered

    private void AtrasMusica1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMusica1MouseExited
        AtrasMusica1.setBackground(Color.CYAN);
    }//GEN-LAST:event_AtrasMusica1MouseExited

    private void AtrasMusica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasMusica1ActionPerformed
        if(Evento.equals("Boda")){
            if(cancion == 1){

            }else{
                cancion--;
                try {
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\BODA\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if (Evento.equals("XV Años")){
            if(cancion == 1){

            }else{
                cancion--;
                try {
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\XV\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("Cumpleaños")){
            if(cancion == 1){

            }else{
                cancion--;
                try {
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\CUMPLEAÑOS\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else{
        
        }
    }//GEN-LAST:event_AtrasMusica1ActionPerformed

    private void AdelanteMusica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdelanteMusica1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AdelanteMusica1MouseClicked

    private void AdelanteMusica1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdelanteMusica1MouseEntered
        AdelanteMusica1.setBackground(Color.RED);
    }//GEN-LAST:event_AdelanteMusica1MouseEntered

    private void AdelanteMusica1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdelanteMusica1MouseExited
        AdelanteMusica1.setBackground(Color.CYAN);
    }//GEN-LAST:event_AdelanteMusica1MouseExited

    private void AdelanteMusica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdelanteMusica1ActionPerformed
        if(Evento.equals("Boda")){
            if(cancion == 3){

            }else{
                try {
                    cancion++;
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\BODA\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("XV Años")){
            if(cancion == 3){

            }else{
                try {
                    cancion++;
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\XV\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("Cumpleaños")){
            if(cancion == 3){

            }else{
                try {
                    cancion++;
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\CUMPLEAÑOS\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else{
        
        }
    }//GEN-LAST:event_AdelanteMusica1ActionPerformed

    private void IniciarMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMusicaMouseClicked
        PanelMusica1.setVisible(true);
        PanelMusica2.setVisible(false);
        PanelVolumen1.setVisible(true);
        PanelVolumen2.setVisible(false);
    }//GEN-LAST:event_IniciarMusicaMouseClicked

    private void IniciarMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMusicaMouseEntered
        IniciarMusica.setBackground(Color.RED);
    }//GEN-LAST:event_IniciarMusicaMouseEntered

    private void IniciarMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMusicaMouseExited
        IniciarMusica.setBackground(Color.CYAN);
    }//GEN-LAST:event_IniciarMusicaMouseExited

    private void IniciarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarMusicaActionPerformed
        try {

            clip.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_IniciarMusicaActionPerformed

    private void AtrasMusica2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMusica2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasMusica2MouseClicked

    private void AtrasMusica2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMusica2MouseEntered
        AtrasMusica2.setBackground(Color.RED);
    }//GEN-LAST:event_AtrasMusica2MouseEntered

    private void AtrasMusica2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMusica2MouseExited
        AtrasMusica2.setBackground(Color.CYAN);
    }//GEN-LAST:event_AtrasMusica2MouseExited

    private void AtrasMusica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasMusica2ActionPerformed
        if(Evento.equals("Boda")){
            if(cancion == 1){

            }else{
                cancion--;
                try {
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\BODA\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("XV Años")){
            if(cancion == 1){

            }else{
                cancion--;
                try {
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\XV\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("Cumpleaños")){
            if(cancion == 1){

            }else{
                cancion--;
                try {
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\CUMPLEAÑOS\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else{
        
        }
    }//GEN-LAST:event_AtrasMusica2ActionPerformed

    private void AdelanteMusica2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdelanteMusica2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AdelanteMusica2MouseClicked

    private void AdelanteMusica2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdelanteMusica2MouseEntered
        AdelanteMusica2.setBackground(Color.RED);
    }//GEN-LAST:event_AdelanteMusica2MouseEntered

    private void AdelanteMusica2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdelanteMusica2MouseExited
        AdelanteMusica2.setBackground(Color.CYAN);
    }//GEN-LAST:event_AdelanteMusica2MouseExited

    private void AdelanteMusica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdelanteMusica2ActionPerformed
        if(Evento.equals("Boda")){
            if(cancion == 3){

            }else{
                try {
                    cancion++;
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\BODA\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("XV Años")){
            if(cancion == 3){

            }else{
                try {
                    cancion++;
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\XV\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else if(Evento.equals("Cumpleaños")){
            if(cancion == 3){

            }else{
                try {
                    cancion++;
                    clip.stop();
                    // Ruta del archivo de audio
                    File audioFile = new File("src\\MUSICA\\CUMPLEAÑOS\\"+cancion+".wav");

                    // Cargar el archivo de audio
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

                    // Obtener el clip de audio
                    clip = AudioSystem.getClip();

                    // Abrir el clip de audio y reproducirlo
                    clip.open(audioStream);

                    volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                    clip.start();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        }else{
        
        }
    }//GEN-LAST:event_AdelanteMusica2ActionPerformed

    private void Mas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas1MouseEntered
        Mas1.setBackground(Color.RED);
    }//GEN-LAST:event_Mas1MouseEntered

    private void Mas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas1MouseExited
        Mas1.setBackground(Color.CYAN);
    }//GEN-LAST:event_Mas1MouseExited

    private void Mas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas1ActionPerformed
        changeVolumeMas(5.0f);
    }//GEN-LAST:event_Mas1ActionPerformed

    private void Menos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menos1MouseEntered
        Menos1.setBackground(Color.RED);
    }//GEN-LAST:event_Menos1MouseEntered

    private void Menos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menos1MouseExited
        Menos1.setBackground(Color.CYAN);
    }//GEN-LAST:event_Menos1MouseExited

    private void Menos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos1ActionPerformed
        changeVolumeMenos(5.0f);
    }//GEN-LAST:event_Menos1ActionPerformed

    private void Mas2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas2MouseEntered
        Mas2.setBackground(Color.RED);
    }//GEN-LAST:event_Mas2MouseEntered

    private void Mas2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas2MouseExited
        Mas2.setBackground(Color.CYAN);
    }//GEN-LAST:event_Mas2MouseExited

    private void Mas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas2ActionPerformed
        changeVolumeMas(5.0f);
    }//GEN-LAST:event_Mas2ActionPerformed

    private void Menos2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menos2MouseEntered
        Menos2.setBackground(Color.RED);
    }//GEN-LAST:event_Menos2MouseEntered

    private void Menos2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menos2MouseExited
        Menos2.setBackground(Color.CYAN);
    }//GEN-LAST:event_Menos2MouseExited

    private void Menos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos2ActionPerformed
        changeVolumeMenos(5.0f);
    }//GEN-LAST:event_Menos2ActionPerformed

    private void CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseEntered
        Cancelar.setBackground(Color.RED);
        Cancelar.setForeground(Color.white);
    }//GEN-LAST:event_CancelarMouseEntered

    private void CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseExited
        Cancelar.setBackground(Boton);
        Cancelar.setForeground(Color.black);
    }//GEN-LAST:event_CancelarMouseExited

    private void SimularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimularMouseEntered
        Simular.setBackground(Color.RED);
        Simular.setForeground(Color.white);
    }//GEN-LAST:event_SimularMouseEntered

    private void SimularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimularMouseExited
        Simular.setBackground(Boton);
        Simular.setForeground(Color.black);
    }//GEN-LAST:event_SimularMouseExited

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        
        this.dispose();
        try {
            
            clip.stop();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //Interfaz
        Principal p = new Principal();
    
        p.setVisible(true);
        p.setLocationRelativeTo(this);
    }//GEN-LAST:event_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdelanteMusica1;
    private javax.swing.JButton AdelanteMusica2;
    private javax.swing.JButton AtrasMusica1;
    private javax.swing.JButton AtrasMusica2;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton DetenerMusica;
    private javax.swing.JButton IniciarMusica;
    private javax.swing.JButton Mas1;
    private javax.swing.JButton Mas2;
    private javax.swing.JButton Menos1;
    private javax.swing.JButton Menos2;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelMusica1;
    private javax.swing.JPanel PanelMusica2;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JPanel PanelVolumen1;
    private javax.swing.JPanel PanelVolumen2;
    private javax.swing.JButton Simular;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel1 extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            if(Evento.equals("Boda")){
                imagen = new ImageIcon(getClass().getResource("/IMAGENES/3.jpg")).getImage();
            }else if(Evento.equals("XV Años")){
            
            }else if(Evento.equals("Cumpleaños")){
                    
            }else{
            
            }
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    class FondoPanel2 extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            if(Evento.equals("Boda")){
                imagen = new ImageIcon(getClass().getResource("/IMAGENES/4.jpg")).getImage();
            } if(Evento.equals("XV Años")){
            
            }else if(Evento.equals("Cumpleaños")){
                    
            }else{
            
            }
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
