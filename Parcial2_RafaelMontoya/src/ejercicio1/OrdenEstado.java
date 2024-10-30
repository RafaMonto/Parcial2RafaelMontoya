package ejercicio1;

public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        if (ordenId < 0) {
            return "Orden Invalida";
        }
        if (ordenId == 0) {
            return "Pendiente";
        }
        if (ordenId > 100) {
            return "Completada";
        }
        if (ordenId > 50) {
            return "En Progreso";
        }
        return "Pendiente";
    }
}
