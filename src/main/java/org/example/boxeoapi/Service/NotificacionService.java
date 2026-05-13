package org.example.boxeoapi.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {

    public void enviarATopic(String topic, String titulo, String cuerpo) {
        try {
            Message mensaje = Message.builder()
                    .setTopic(topic)
                    .setNotification(Notification.builder()
                            .setTitle(titulo)
                            .setBody(cuerpo)
                            .build())
                    .build();
            String respuesta = FirebaseMessaging.getInstance().send(mensaje);
            System.out.println("Notificación enviada OK: " + respuesta);
        } catch (Exception e) {
            System.out.println("Error enviando notificación: " + e.getMessage());
        }
    }
}