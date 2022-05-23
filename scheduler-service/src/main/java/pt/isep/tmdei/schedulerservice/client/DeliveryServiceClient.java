package pt.isep.tmdei.schedulerservice.client;

import pt.isep.tmdei.deliverymanagement.CreateDeliveryRequest;
import pt.isep.tmdei.deliverymanagement.CreateDeliveryResponse;
import pt.isep.tmdei.deliverymanagement.PickupPackageRequest;
import pt.isep.tmdei.deliverymanagement.PickupPackageResponse;
import pt.isep.tmdei.deliverymanagement.UpdateDeliveryDroneRequest;
import pt.isep.tmdei.deliverymanagement.UpdateDeliveryDroneResponse;
import pt.isep.tmdei.deliverymanagement.UpdateDeliveryStatusRequest;
import pt.isep.tmdei.deliverymanagement.UpdateDeliveryStatusResponse;

public interface DeliveryServiceClient {

    CreateDeliveryResponse createDelivery(CreateDeliveryRequest request);

    UpdateDeliveryStatusResponse updateDeliveryStatus(UpdateDeliveryStatusRequest request);

    UpdateDeliveryDroneResponse updateDeliveryDrone(UpdateDeliveryDroneRequest request);

    PickupPackageResponse pickupPackage(PickupPackageRequest request);

}
