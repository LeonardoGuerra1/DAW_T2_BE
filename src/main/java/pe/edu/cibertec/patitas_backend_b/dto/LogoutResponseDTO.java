package pe.edu.cibertec.patitas_backend_b.dto;

import java.util.Date;

public record LogoutResponseDTO(String codigo, Date fecha, String mensajeError) {
}
